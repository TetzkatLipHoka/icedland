#
# SPDX-License-Identifier: MIT
# Copyright wtfsckgh@gmail.com
# Copyright iced contributors
#

# ⚠️This file was generated by GENERATOR!🦹‍♂️

# pylint: disable=invalid-name
# pylint: disable=line-too-long
# pylint: disable=too-many-lines

"""
Decoder error
"""

from typing import List

NONE: int = 0
"""
No error. The last decoded instruction is a valid instruction
"""
INVALID_INSTRUCTION: int = 1
"""
It's an invalid instruction or an invalid encoding of an existing instruction (eg. some reserved bit is set/cleared)
"""
NO_MORE_BYTES: int = 2
"""
There's not enough bytes left to decode the instruction
"""

__all__: List[str] = []