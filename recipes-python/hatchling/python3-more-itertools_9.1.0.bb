DESCRIPTION = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[md5sum] = "5361460cc76a8f4a84e402d3a5d47ade"
SRC_URI[sha256sum] = "cabaa341ad0389ea83c17a94566a53ae4c9d07349861ecb14dc6d0345cf9ac5d"

inherit pypi python_flit_core

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-asyncio \
        "

BBCLASSEXTEND = "native nativesdk"
