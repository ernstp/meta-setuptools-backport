SUMMARY = "Data validation using Python type hints"
HOMEPAGE = "https://pydantic.dev/"
LICENSE = "MIT"
SECTION = "devel/python"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c02ea30650b91528657db64baea1757"

SRC_URI[md5sum] = "4279a3a76b4c287b444d7ce37fed02c2"
SRC_URI[sha256sum] = "cfc83c0678b6ba51b0532bea66860617c4cd4251ecf76e9846fa5a9f3454e97e"

inherit pypi python_hatchling

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-typing-extensions \
"
