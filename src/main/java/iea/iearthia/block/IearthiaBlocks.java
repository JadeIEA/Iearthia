package iea.iearthia.block;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IearthiaBlocks {
    @GameRegistry.ObjectHolder("iearthia:oretitanium")
    public static BlockOreTitanium oreTitanium;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        oreTitanium.initModel();
    }
}
