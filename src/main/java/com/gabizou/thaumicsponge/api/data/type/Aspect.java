/*
 * This file is part of ThaumicSpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) Gabriel Harris-Rouquette
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.gabizou.thaumicsponge.api.data.type;

import org.spongepowered.api.CatalogType;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.util.annotation.CatalogedBy;

import java.util.Collection;

/**
 * An aspect that is an "element" that can describe something.
 * {@link ItemStack}s, {@link Entity} instances, and {@link BlockType}s
 * are made up of all sorts of aspects. Generally, all objects have at
 * least one aspect, but some mod added ones can contain none.
 */
@CatalogedBy(Aspects.class)
public interface Aspect extends CatalogType {

    /**
     * Gets a {@link Collection} of {@link Aspect}s
     * that this aspect may be combined of. This is the equivalent
     * to {@link Aspects#LUX} being made up of
     * {@link Aspects#AER} and {@link Aspects#IGNIS}.
     *
     * @return The collection of thaumic aspects
     */
    Collection<Aspect> getComponents();

    /**
     * Gets whether this aspect is considered "primal". "Primal"
     * aspects are generally the core aspects such as
     * {@link Aspects#AER}, {@link Aspects#AQUA},
     * {@link Aspects#IGNIS}, {@link Aspects#TERRA},
     * {@link Aspects#ORDO}, and {@link Aspects#PERDITIO}.
     *
     * Note: It's optinoal that an aspect may be primal if it's components
     * contain more than <code>2</code> components.
     *
     * @return True if this is a primal aspect
     */
    boolean isPrimalAspect();

}
