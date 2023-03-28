SUMMARY = "FastAPI framework, high performance, easy to learn, fast to code, ready for production"
HOMEPAGE = "https://fastapi.tiangolo.com"
LICENSE = "MIT"
SECTION = "devel/python"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95792ff3fe8e11aa49ceb247e66e4810"

SRC_URI[md5sum] = "c8c892718871a5eb0600e20adfb14022"
SRC_URI[sha256sum] = "4a75936dbf9eb74be5eb0d41a793adefe9f3fc6ba66dbdabd160120fd3c2d9cd"

inherit pypi python_hatchling

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-pydantic \
    ${PYTHON_PN}-starlette \
"
