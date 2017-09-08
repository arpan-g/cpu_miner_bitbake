If you are building a linux image using bitbake for your embedded platform and are curious to mine either BTC/LTC you can use this recipe.
This recipe uses cpu miner application available at:
https://github.com/pooler/cpuminer

This is a simple recipe with the least possible parameters required to build the image.
Below I explain what these parameter do:

DEPENDS : In depends you specify the external libraries applicaion depends on. Since cpu miner depends on crl we add curl.

inherit autotools: since the application uses autotools to build the application.

SRCREV : Here you give the commit number, using which you want to build you applicaion. I have used the latest commit number the repo had on 8th sep 2017. To find out the commit number checkout the cpu miner from https://github.com/pooler/cpuminer. Using the command git log you can see various commit numbers and you can choose the SRCREV you want to use.

SRC_URI : Corresponds to the URI of the repository.

The application will be installed in your /usr/bin directory with the minerd.

Author: Arpan
email: arpan.neo@gmail.com

P.S : I built this application to check how hot our processor gets and how effective our heat sink was :D.
Happy bitbaking and bitmining. :)





