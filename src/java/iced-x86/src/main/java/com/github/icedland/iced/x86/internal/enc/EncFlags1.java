// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.internal.enc;

/**
 * DO NOT USE: INTERNAL API
 */
public final class EncFlags1 {
	private EncFlags1() {
	}

	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int NONE = 0x0000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int LEGACY_OP_MASK = 0x0000_007F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int LEGACY_OP0_SHIFT = 0x0000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int LEGACY_OP1_SHIFT = 0x0000_0007;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int LEGACY_OP2_SHIFT = 0x0000_000E;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int LEGACY_OP3_SHIFT = 0x0000_0015;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX_OP_MASK = 0x0000_003F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX_OP0_SHIFT = 0x0000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX_OP1_SHIFT = 0x0000_0006;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX_OP2_SHIFT = 0x0000_000C;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX_OP3_SHIFT = 0x0000_0012;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int VEX_OP4_SHIFT = 0x0000_0018;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XOP_OP_MASK = 0x0000_001F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XOP_OP0_SHIFT = 0x0000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XOP_OP1_SHIFT = 0x0000_0005;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XOP_OP2_SHIFT = 0x0000_000A;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int XOP_OP3_SHIFT = 0x0000_000F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVEX_OP_MASK = 0x0000_001F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVEX_OP0_SHIFT = 0x0000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVEX_OP1_SHIFT = 0x0000_0005;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVEX_OP2_SHIFT = 0x0000_000A;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int EVEX_OP3_SHIFT = 0x0000_000F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_OP_MASK = 0x0000_000F;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_OP0_SHIFT = 0x0000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_OP1_SHIFT = 0x0000_0004;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_OP2_SHIFT = 0x0000_0008;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int MVEX_OP3_SHIFT = 0x0000_000C;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int IGNORES_ROUNDING_CONTROL = 0x4000_0000;
	/**
	 * DO NOT USE: INTERNAL API
	 */
	public static final int AMD_LOCK_REG_BIT = 0x8000_0000;
}
