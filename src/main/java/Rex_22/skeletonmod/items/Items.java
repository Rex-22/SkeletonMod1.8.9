package Rex_22.skeletonmod.items;

import Rex_22.skeletonmod.reference.LogHelper;
import Rex_22.skeletonmod.reference.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.common.registry.GameRegistry;

public enum Items {
    //ADD ITEMS HERE
    EXAMPLE_ITEM("example_item", new ItemExampleItem(), CreativeTabs.tabDecorations)
    ;

    private static boolean registeredItem = false;
    public final Item item;
    private final String internalName;
    private final CreativeTabs creativeTabs;

    Items(String internalName, Item item) {
        this(internalName, item, null);
    }

    Items(String internalName, Item item, CreativeTabs creativeTabs) {
        this.internalName = internalName;
        this.item = item;
        item.setUnlocalizedName(ModInfo.MOD_ID + "." + internalName);
        this.creativeTabs = creativeTabs;
    }

    public static void registerAll() {
        if (registeredItem)
            return;
        for (Items i : Items.values())
            i.registerItem();
        registeredItem = true;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getStatName() {
        return StatCollector.translateToLocal(item.getUnlocalizedName());
    }

    private void registerItem() {
        GameRegistry.registerItem(item, internalName);

        LogHelper.info("Registered Item: " + internalName);
    }

    public ItemStack getStack(int damage, int size) {
        return new ItemStack(item, size, damage);
    }

}
