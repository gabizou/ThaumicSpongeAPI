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
package com.gabizou.thaumicsponge.api.data;

import static org.spongepowered.api.data.DataQuery.of;
import static org.spongepowered.api.data.key.KeyFactory.makeMapKey;
import static org.spongepowered.api.data.key.KeyFactory.makeSingleKey;

import com.gabizou.thaumicsponge.api.data.type.Aspect;
import com.gabizou.thaumicsponge.api.data.type.AuraNodeType;
import com.gabizou.thaumicsponge.api.data.type.WarpType;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.data.value.mutable.MutableBoundedValue;
import org.spongepowered.api.data.value.mutable.Value;

public final class ThaumicKeys {

    public static final Key<Value<AuraNodeType>> AURA_NODE_TYPE;
    public static final Key<Value<Aspect>> AURA_NODE_ASPECT;
    public static final Key<Value<Boolean>> AURA_NODE_IS_STABLE;
    public static final Key<MutableBoundedValue<Integer>> AURA_NODE_SIZE;
    public static final Key<MapValue<WarpType, Integer>> PLAYER_WARP;

    static {
        AURA_NODE_TYPE = makeSingleKey(AuraNodeType.class, Value.class, of("Aura", "NodeType"));
        AURA_NODE_ASPECT = makeSingleKey(Aspect.class, Value.class, of("Aura", "Aspect"));
        AURA_NODE_IS_STABLE = makeSingleKey(Boolean.class, Value.class, of("Aura", "Stable"));
        AURA_NODE_SIZE = makeSingleKey(Integer.class, MutableBoundedValue.class, of("Aura", "Size"));
        PLAYER_WARP = makeMapKey(WarpType.class, Integer.class, of("PlayerWarp"));
    }

    private ThaumicKeys() {
    }

}
