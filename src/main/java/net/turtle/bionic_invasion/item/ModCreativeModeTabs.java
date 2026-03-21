package net.turtle.bionic_invasion.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.turtle.bionic_invasion.BionicInvasionMod;
import net.turtle.bionic_invasion.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BionicInvasionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BIONIC_INVASION_TAB = CREATIVE_MODE_TABS.register("bionic_invasion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NANITE.get()))
                    .title(Component.translatable("creativetab.bionic_invasion.bionic_invasion"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NANITE.get());
                        output.accept(ModItems.SCRAPS.get());
                        output.accept(ModBlocks.NANITE_BLOCK.get());
                        output.accept(ModBlocks.CONVERTED_DIRT.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
