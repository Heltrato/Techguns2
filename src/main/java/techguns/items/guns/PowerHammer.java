package techguns.items.guns;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import techguns.TGItems;
import techguns.TGPackets;
import techguns.TGSounds;
import techguns.items.guns.ammo.AmmoType;
import techguns.packets.PacketSpawnParticle;
import techguns.util.ItemUtil;

public class PowerHammer extends GenericGunMeleeCharge {
	
	public PowerHammer(String name, ChargedProjectileSelector projectile_selector, boolean semiAuto, int minFiretime,
			int clipsize, int reloadtime, float damage, SoundEvent firesound, SoundEvent reloadsound, int TTL,
			float accuracy, float fullChargeTime, int ammoConsumedOnFullCharge) {
		super(name, projectile_selector, semiAuto, minFiretime, clipsize, reloadtime, damage, firesound, reloadsound, TTL,
				accuracy, fullChargeTime, ammoConsumedOnFullCharge);
		
		this.setMiningHeads(TGItems.POWERHAMMERHEAD_OBSIDIAN, TGItems.POWERHAMMERHEAD_CARBON);
	}

	@Override
	protected void spawnSweepParticle(World w, double x, double y, double z, double motionX, double motionY,
			double motionZ) {
		TGPackets.network.sendToAllAround(new PacketSpawnParticle("PowerhammerImpact",x,y,z), new TargetPoint(w.provider.getDimension(), x, y, z, 32.0f));
	}


	@Override
	protected void playSweepSoundEffect(EntityPlayer player) {
		player.world.playSound((EntityPlayer) null, player.posX, player.posY, player.posZ, TGSounds.POWERHAMMER_IMPACT,
				player.getSoundCategory(), 1.0F, 1.0F);
	}

}
