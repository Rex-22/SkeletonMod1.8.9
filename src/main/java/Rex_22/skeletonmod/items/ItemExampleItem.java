package Rex_22.skeletonmod.items;

import Rex_22.skeletonmod.reference.ModInfo;
import Rex_22.skeletonmod.util.IItemRenderer;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemExampleItem extends ItemBase implements IItemRenderer {

    @Override
    public void registerItemRenderer() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + getRenderName(), "inventory"));
    }
}
