SUMMARY = "The little ASGI framework that shines"
HOMEPAGE = "https://www.starlette.io"
LICENSE = "BSD-3-Clause"
SECTION = "devel/python"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=11e8c8dbfd5fa373c703de492140ff7a"

SRC_URI[md5sum] = "88f0bec7640af980d6c1e7a2aa157d73"
SRC_URI[sha256sum] = "41da799057ea8620e4667a3e69a5b1923ebd32b1819c8fa75634bbe8d8bea9bd"

inherit pypi python_hatchling

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-anyio \
    ${PYTHON_PN}-typing-extensions \
"
