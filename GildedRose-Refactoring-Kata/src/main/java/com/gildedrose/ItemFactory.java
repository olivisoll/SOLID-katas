package com.gildedrose;

final class ItemFactory {
    static Item basedOn(final String rawName, final int rawSellIn, final int rawQuality) throws ItemQualityOutOfRangeException {
        ItemName name = new ItemName(rawName);
        ItemSellIn sellIn = new ItemSellIn(rawSellIn);
        ItemQuality quality = new ItemQuality(rawQuality);

        if (name.isAgedBrie()) return new AgedBrie(sellIn, quality);
        if (name.isBackstagePasses()) return new BackstagePasses(sellIn, quality);
        if (name.isSulfuras()) return new Sulfuras(sellIn);
        if (name.isConjured()) return new Conjured(sellIn, quality);

        return new StandardItem(name, sellIn, quality);
    }
}
