DESCRIPTION = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = "https://github.com/erikrose/more-itertools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI[sha256sum] = "5a6257e40878ef0520b1803990e3e22303a41b5714006c32a3fd8304b26ea1ab"

inherit pypi python_flit_core

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-asyncio \
        "

BBCLASSEXTEND = "native nativesdk"
