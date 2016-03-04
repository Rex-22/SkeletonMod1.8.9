package Rex_22.skeletonmod.proxy;

import Rex_22.skeletonmod.blocks.Blocks;
import Rex_22.skeletonmod.items.Items;
import Rex_22.skeletonmod.util.FuleHandler;
import Rex_22.skeletonmod.world.WorldGen;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public abstract class CommonProxy implements IProxy {

    //Register Items
    @Override
    public void registerItems() {
        Items.registerAll();
    }

    //Register Blocks
    @Override
    public void registerBlocks() {
        Blocks.registerAll();
    }

    //Register Recipes
    @Override
    public void registerRecipes() {
        //Blocks
        GameRegistry.addRecipe(new ItemStack(Blocks.EXAMPLE_BLOCK.block), "xxx", "xxx", "xxx", 'x', Items.EXAMPLE_ITEM.item);

        //Items
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.EXAMPLE_ITEM.item), " s ", "sss", " s ", 's', "plankWood"));
    }

    //Register Fuel
    @Override
    public void registerFuel() {
        GameRegistry.registerFuelHandler(new FuleHandler());
    }

    //Register World Gen
    @Override
    public void registerWorldGen() {
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }
}
