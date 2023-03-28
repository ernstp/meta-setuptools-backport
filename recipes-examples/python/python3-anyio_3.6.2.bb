SUMMARY = "High level asynchronous concurrency and networking framework that works on top of either trio or asyncio"
HOMEPAGE = "https://anyio.readthedocs.io"
LICENSE = "MIT"
SECTION = "devel/python"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0a769411d2af7894099e8ff75058c9f"

SRC_URI[md5sum] = "2a2b45a9324f7dfd3b351452f8097a3c"
SRC_URI[sha256sum] = "25ea0d673ae30af41a0c442f81cf3b38c7e79fdc7b60335a4c14e05eb0947421"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-sniffio \
    ${PYTHON_PN}-typing-extensions \
    ${PYTHON_PN}-idna \
"
