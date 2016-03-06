package Rex_22.skeletonmod.blocks;

import Rex_22.skeletonmod.reference.ModInfo;
import Rex_22.skeletonmod.util.IBlockRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockExampleBlock extends BlockBase implements IBlockRenderer {

    public BlockExampleBlock() {
        super(Material.rock);
    }

    @Override
    public void registerBlockRenderer() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + getRenderName(), "inventory"));
    }
}
