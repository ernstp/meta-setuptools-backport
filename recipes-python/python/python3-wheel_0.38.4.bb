SUMMARY = "The official binary distribution format for Python "
HOMEPAGE = "https://github.com/pypa/wheel"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[sha256sum] = "965f5259b566725405b05e7cf774052044b1ed30119b5d586b2703aafe8719ac"

inherit python_flit_core pypi

SRC_URI += " file://0001-Backport-pyproject.toml-from-flit-backend-branch.patch"

BBCLASSEXTEND = "native nativesdk"

# This used to use the bootstrap install which didn't compile. Until we bump the
# tmpdir version we can't compile the native otherwise the sysroot unpack fails
INSTALL_WHEEL_COMPILE_BYTECODE:class-native = "--no-compile-bytecode"

SKIP_PYTHON_RDEP = "1"
