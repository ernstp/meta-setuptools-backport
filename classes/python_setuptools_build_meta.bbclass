#
# Copyright OpenEmbedded Contributors
#
# SPDX-License-Identifier: MIT
#

inherit setuptools3backport-base python_pep517

DEPENDS += "python3-setuptools-native python3-wheel-native"

inherit python_rdep
