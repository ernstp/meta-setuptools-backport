SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://pypi.org/project/setuptools"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;beginline=1;endline=19;md5=7a7126e068206290f3fe9f8d6c713ea6"

inherit pypi python_setuptools_build_meta

SRC_URI:append:class-native = " file://0001-conditionally-do-not-fetch-code-by-easy_install.patch"

SRC_URI += "file://0001-change-shebang-to-python3.patch \
            file://0001-_distutils-sysconfig.py-make-it-possible-to-substite.patch"

SRC_URI[sha256sum] = "a7620757bf984b58deaf32fc8a4577a9bbc0850cf92c20e1ce41c38c19e5fb75"

DEPENDS += "${PYTHON_PN}"

BBCLASSEXTEND = "native nativesdk"

# The pkg-resources module can be used by itself, without the package downloader
# and easy_install. Ship it in a separate package so that it can be used by
# minimal distributions.
PACKAGES += "${PYTHON_PN}-pkg-resources "
FILES:${PYTHON_PN}-pkg-resources = "${PYTHON_SITEPACKAGES_DIR}/pkg_resources/*"
RDEPENDS:${PYTHON_PN}-pkg-resources = "\
    ${PYTHON_PN}-compression \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-plistlib \
    ${PYTHON_PN}-pprint \
"

# This used to use the bootstrap install which didn't compile. Until we bump the
# tmpdir version we can't compile the native otherwise the sysroot unpack fails
INSTALL_WHEEL_COMPILE_BYTECODE:class-native = "--no-compile-bytecode"
