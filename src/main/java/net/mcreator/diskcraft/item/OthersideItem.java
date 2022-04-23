
package net.mcreator.diskcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.diskcraft.DiskcraftModElements;

@DiskcraftModElements.ModElement.Tag
public class OthersideItem extends DiskcraftModElements.ModElement {
	@ObjectHolder("diskcraft:otherside")
	public static final Item block = null;

	public OthersideItem(DiskcraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DiskcraftModElements.sounds.get(new ResourceLocation("diskcraft:otherside")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("otherside");
		}
	}
}
