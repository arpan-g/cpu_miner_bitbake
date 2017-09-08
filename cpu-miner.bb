DESCRIPTION = "cpu miner app"
LICENSE = "CLOSED"
inherit autotools pkgconfig
DEPENDS = "curl"
SRCREV = "32464ebfc42858462418bd5df47a796917c48d82"
SRC_URI = "git://github.com/pooler/cpuminer.git;protocol=https"
S = "${WORKDIR}/git"
BBCLASSEXTEND = "native"

