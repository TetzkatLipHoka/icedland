# SPDX-License-Identifier: MIT
# Copyright (C) 2018-present iced project and contributors

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Mnemonic condition code selector (eg. ``JE`` / ``JZ``)
"""

import typing
if typing.TYPE_CHECKING:
	from ._iced_x86_py import CC_e
else:
	CC_e = int

E: CC_e = 0 # type: ignore
"""
``JE``, ``CMOVE``, ``SETE``, ``LOOPE``, ``REPE``
"""
Z: CC_e = 1 # type: ignore
"""
``JZ``, ``CMOVZ``, ``SETZ``, ``LOOPZ``, ``REPZ``
"""
