package Rex_22.skeletonmod.items;

import Rex_22.skeletonmod.reference.ModInfo;
import Rex_22.skeletonmod.util.IItemRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.common.registry.GameRegistry;

public enum Items {
    //ADD ITEMS HERE
    EXAMPLE_ITEM("example_item", new ItemExampleItem(), CreativeTabs.tabDecorations)
    ;

    public final Item item;
    private final String internalName;

    Items(String internalName, Item item) {
        this(internalName, item, null);
    }

    Items(String internalName, Item item, CreativeTabs creativeTabs) {
        this.internalName = internalName;
        this.item = item;
        item.setUnlocalizedName(ModInfo.MOD_ID + ":" + internalName);
        item.setCreativeTab(creativeTabs);
    }

    public static void registerItems() {
        for (Items i : Items.values()) {
            i.register();
        }
    }

    public void register() {
        // Register Block in Game Registry
        GameRegistry.registerItem(item, internalName);

        // If bock has Render Info, Register Renderer
        if (item instanceof IItemRenderer) {
            ((IItemRenderer) item).registerItemRenderer();
        }
    }

    public String getStatName() {
        return StatCollector.translateToLocal(item.getUnlocalizedName());
    }

    public ItemStack getStack(int damage, int size) {
        return new ItemStack(item, size, damage);
    }

}
