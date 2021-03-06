package com.gildedrose;

final class BackstagePasses extends Item{

    private static final int DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD = 10;
    private static final int TRIPLE_QUALITY_InCREASE_SELL_IN_THRESHOLD = 5;
    private static final int QUALITY_RESET_SELL_IN_THRESHOLD = 0;

    public BackstagePasses(final ItemSellIn sellIn, final ItemQuality quality) {
        super(new ItemName(ItemName.BACKSTAGE_PASSES), sellIn, quality);
    }

    @Override
    void update() {
        decreaseSellIn();

        increaseQuality();

        if (hasToBeSoldInLessThan(DOUBLE_QUALITY_INCREASE_SELL_IN_THRESHOLD)){
            increaseQuality();
        }

        if (hasToBeSoldInLessThan(TRIPLE_QUALITY_InCREASE_SELL_IN_THRESHOLD)){
            increaseQuality();
        }

        if (hasToBeSoldInLessThan(QUALITY_RESET_SELL_IN_THRESHOLD)){
            resetQuality();
        }
    }
}
