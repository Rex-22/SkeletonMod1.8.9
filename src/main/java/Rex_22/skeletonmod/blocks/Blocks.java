package Rex_22.skeletonmod.blocks;

import Rex_22.skeletonmod.reference.LogHelper;
import Rex_22.skeletonmod.reference.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.common.registry.GameRegistry;

public enum Blocks {
    //ADD BLOCKS HERE
    EXAMPLE_BLOCK("example_block", new BlockExampleBlock(), CreativeTabs.tabBlock)
    ;

    private static boolean registeredBlock = false;
    public final Block block;
    private final String internalName;
    private final Class<? extends ItemBlock> itemBlockClass;
    private final CreativeTabs creativeTabs;

    Blocks(String internalName, Block block) {
        this(internalName, block, ItemBlock.class, null);
    }

    Blocks(String internalName, Block block, CreativeTabs creativeTabs) {
        this(internalName, block, ItemBlock.class, creativeTabs);
    }

    Blocks(String internalName, Block block, Class<? extends ItemBlock> itemBlockClass) {
        this(internalName, block, itemBlockClass, null);
    }

    Blocks(String internalName, Block block, Class<? extends ItemBlock> itemBlockClass, CreativeTabs creativeTabs) {
        this.internalName = internalName;
        this.block = block;
        this.itemBlockClass = itemBlockClass;
        this.creativeTabs = creativeTabs;
    }

    public static void registerAll() {
        LogHelper.info("Registering things");
        if (!registeredBlock) {
            for (Blocks b : Blocks.values()) {
                b.registerBlock();
            }
            registeredBlock = true;
        }
    }

    public String getInternalName() {
        return internalName;
    }

    public String getStatName() {
        return StatCollector.translateToLocal(block.getUnlocalizedName().replace("tileentity.", "block."));
    }

    private void registerBlock() {
        GameRegistry.registerBlock(block.setCreativeTab(creativeTabs).setUnlocalizedName(ModInfo.MOD_ID + "." + internalName),
                itemBlockClass, internalName);

        LogHelper.info("Registered Block: " + internalName);
    }

}
