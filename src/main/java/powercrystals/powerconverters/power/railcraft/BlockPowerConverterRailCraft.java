package powercrystals.powerconverters.power.railcraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import powercrystals.powerconverters.gui.PCCreativeTab;
import powercrystals.powerconverters.power.BlockPowerConverter;
import powercrystals.powerconverters.reference.Reference;

public class BlockPowerConverterRailCraft extends BlockPowerConverter {
	public BlockPowerConverterRailCraft() {
		super(2);
		setBlockName("powerconverters.steam");
		setCreativeTab(PCCreativeTab.tab);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		if (metadata == 0)
			return new TileEntityRailCraftConsumer();
		else if (metadata == 1)
			return new TileEntityRailCraftProducer();

		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir) {
		_icons[0] = ir.registerIcon(Reference.MOD_PREFIX + getUnlocalizedName() + ".consumer.off");
		_icons[1] = ir.registerIcon(Reference.MOD_PREFIX + getUnlocalizedName() + ".consumer.on");
		_icons[2] = ir.registerIcon(Reference.MOD_PREFIX + getUnlocalizedName() + ".producer.off");
		_icons[3] = ir.registerIcon(Reference.MOD_PREFIX + getUnlocalizedName() + ".producer.on");
	}
}
