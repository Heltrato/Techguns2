package techguns.world.dungeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

import net.minecraft.world.World;
import techguns.world.dungeon.TemplateSegment.SegmentType;

public class DungeonTemplate implements Serializable{

	private static final long serialVersionUID = 1L+1;

	public static final String SCAN_DIR = "./templates/";
	
	public static HashMap<String, DungeonTemplate> dungeonTemplates = new HashMap<>();
	
	public int sizeXZ;
	public int sizeY;
	
	public HashMap<SegmentType, DungeonSegment> segments = new HashMap<>();

	public String name;
	
	
	static {
		loadTemplates();
	}
	
	public DungeonTemplate(int sizeXZ, int sizeY) {
		super();
		this.sizeXZ = sizeXZ;
		this.sizeY = sizeY;
	}
	
	public void placeTemplate(World world, int posX, int posY, int posZ) {
		for (DungeonSegment segment : segments.values()) {
			if (segment.template == null) segment.template = this;
			segment.placeTemplateSegment(world, posX, posY, posZ, 0);
		}
	}

	public static DungeonTemplate scanTemplate(World world, int posX, int posY, int posZ, int sizeXZ, int sizeY, String name) {
		DungeonTemplate template = new DungeonTemplate(sizeXZ, sizeY);
		template.name = name;
		
		for (SegmentType type : TemplateSegment.templateSegments.keySet()) {
			DungeonSegment segment = new DungeonSegment(template, type);
			segment.scanBlocks(world, posX, posY, posZ);
			template.segments.put(type, segment);
		}
		
		dungeonTemplates.put(name, template);
		
		return template;
	}
	
	public static void loadTemplates() {
		File folder = new File(SCAN_DIR);
		if (folder != null) {
			File[] files =folder.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.getAbsolutePath().endsWith("ser")) {
						try {				
							FileInputStream streamIn = new FileInputStream(file);
						    ObjectInputStream ois = new ObjectInputStream(streamIn);
						    
						    DungeonTemplate template = (DungeonTemplate)ois.readObject();
						    String name = file.getName().substring(0, file.getName().length()-4);
						    template.name = name;
						    dungeonTemplates.put(name, template);
						    
						    ois.close();
						    streamIn.close();
						    
						}catch (IOException | ClassNotFoundException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public String getName() {
		return name;
	}

}
