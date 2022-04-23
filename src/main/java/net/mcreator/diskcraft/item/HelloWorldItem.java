
package net.mcreator.diskcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.diskcraft.DiskcraftModElements;

@DiskcraftModElements.ModElement.Tag
public class HelloWorldItem extends DiskcraftModElements.ModElement {
	@ObjectHolder("diskcraft:hello_world")
	public static final Item block = null;

	public HelloWorldItem(DiskcraftModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DiskcraftModElements.sounds.get(new ResourceLocation("diskcraft:helloworld")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("hello_world");
		}
	}
}
