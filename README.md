# Acer Gaming RGB keyboard backlight and Turbo mode linux kernel module (Acer Predator, Acer Helios, Acer Nitro)
Inspired by https://github.com/hackbnw/faustus, this projects extends current acer-wmi linux kernel module to support acer gaming functions

Turbo mode should support Acer Helios Predator and Acer Triton Predator series. 
RGB Keyboard is only tested on Acer (Predator, Helios, Nitro) 300 series ( 4-zone RGB ). 

Experimental unofficial Linux platform driver module for Acer Predator Gaming series laptops.
## WARNING: Use at your own risk. This driver interacts with low-level WMI methods which hasn't been tested on all series.  

**Will this work on my laptop?**

Compablity table:

| Product name  | Turbo Mode (Implemented)| Turbo Mode (Tested)| RGB (Impelmented)| RGB (Tested)|
| ------------- |:-----------------------:|:------------------:|:-----------------:|:------------:|
| A515-55  |   No                   |   No               | Yes               |Yes           |
| PH315-52 |   Yes                   |   Yes               | Yes               |Yes           |
| PH315-53 |   Yes                   |   Yes               | Yes               |Yes           |
| PH317-53 |   Yes                   |   Yes               | Yes               |Yes           |
| PH317-54 |   Yes                   |   No               | Yes               |No           |
| PH517-51 |   Yes                   |   No               | Yes               |No           |
| PH517-52 |   Yes                   |   No               | Yes               |No           |
| PH517-61 |   Yes                   |   No               | Yes               |No           |
| PH717-71 |   Yes                   |   No               | Yes               |No           |
| PH717-72 |   Yes                   |   No               | Yes               |No           |
| PT314-51 |   No                   |   No               | Yes               |Yes           |
| PT315-51 |   Yes                   |   Yes               | Yes               |Yes           |
| PT315-52 |   Yes                   |   No               | Yes               |No           |
| PT515-51 |   Yes                   |   No               | Yes               |No           |
| PT515-52 |   Yes                   |   No               | Yes               |No           |
| PT917-71 |   Yes                   |   No               | Yes               |No           |




Obviously I dont have access to all these models, so if it worked(or not) for you, kindly please mention your model on issues so we can ship this to Linux kernel.

You can find your model using this command:
`sudo dmidecode -s system-product-name`
___
#### RGB Keyboard:
Currently the repository only supports dynamic effects. I think It should work only on 4zone RGB keyboards like 300 series, but haven't test other models.

Check the output of this command:  
`# file /sys/bus/wmi/devices/7A4DDFE7-5B5D-40B4-8595-4408E0CC7F56/`  
If the directory exists, it should work fine. Otherwise RGB may not work.

## Requirements
Secure boot must be disabled.  
Install linux headers using your distro package manager:
Ubuntu (or other debian baseds distros):
`sudo apt-get install linux-headers-$(uname -r)`

Arch (I don't use arch anymore btw):
`sudo pacman -S linux-headers`



## Install
```bash
git clone https://github.com/JafarAkhondali/acer-helios-300-rgb-keyboard-linux-module
cd "acer-helios-300-rgb-keyboard-linux-module"
chmod +x ./install.sh
./install.sh
```



## Usage
Turbo mode should work fine by using the button.

For RGB, the module will mount a new character device at `/dev/acer-gkbbl-0` to communicate
with kernel space.  
To make it easier to interact with this device, a simple python has been attached.  
`python3 facer_rgb.py`  
or check help for more advanced usage:  
`python3 facer_rgb.py --help`

```
-m [mode index]
Animation effect modes:

    1 -> Breath [Accepts RGB color]
    2 -> Neon
    3 -> Wave
    4 -> Shifting [Accepts RGB color]
    5 -> Zoom [Accepts RGB color]

-s [speed]
Animation Speed:

    0 -> No animation speed (static)
    1 -> Slowest animation speed
    9 -> Fastest animation speed
    
    You can use values between 1-9 to adjust the speed, or increase speed even more than 255, but keep in mind
    that values higher than 9 were not used in official PredatorSense application.

-b [brightness]
Keyboard backlight Brightness:

    0   -> No backlight (turned off)
    100 -> Maximum backlight brightness

-d [direction]
Animation direction:

    1   -> Right to Left
    2   -> Left to Right

-cR [red value]
Some modes require specific [R]GB color

    0   -> Minimum red range
    255 -> Maximum red range

-cG [green value]
Some modes require specific R[G]B color

    0   -> Minimum green range
    255 -> Maximum green range

-cB [blue value]
Some modes require specific RG[B] color

    0   -> Minimum blue range
    255 -> Maximum blue range
```
Sample usages:

Breath effect with Purple color(speed=4, brightness=100):  
`python3 facer_rgb.py -m 1 -s 4 -b 100 -cR 255 -cG 0 -cB 255`

Neon effect(speed=3, brightness=100):  
`python3 facer_rgb.py -m 2 -s 3 -b 100`

Wave effect(speed=5, brightness=100):  
`python3 facer_rgb.py -m 3 -s 5 -b 100`

Shifting effect with Blue color (speed=5, brightness=100):  
`python3 facer_rgb.py -m 4 -s 5 -b 100 -cR 0 -cB 255 -cG 0`

Zoom effect with Green color (speed=7, brightness=100):  
`python3 facer_rgb.py -m 5 -s 7 -b 100 -cR 0 -cB 0 -cG 255`

Static waving (speed=0):
`python3 facer_rgb.py -m 3 -s 0 -b 100`



## Known problems
Changes are not persistent after reboot. You'll need to install the module again.  
Sometimes creating RGB char device may fail. This can be fixed using (thanks to Zehra for mentioning this):
```
sudo ./uninstall.sh
sudo rm /dev/acer-gkbbl-0
sudo ./install.sh
```
If installation failed, check this [issue](https://github.com/JafarAkhondali/acer-predator-turbo-and-rgb-keyboard-linux-module/issues/4#issuecomment-905486393)


## Uninstall:
Simply run `./uninstall.sh` and (hopefully) everything should be back to normal.

## Feedback:
If this worked, or didn't worked for you, kindly make a new issue, and attach the following if possible:  
`sudo dmidecode | grep "Product Name" -B 2 -A 4`  
`sudo cat /sys/firmware/acpi/tables/DSDT > dsdt.aml`

## Donation:
Donations are not required but shows your ❤️ to open source and encourages me to implement more features for this tool.
[Paypal](https://www.paypal.com/paypalme/jafarakhondali)

BNB: bnb18vseyxgydwq8xs2hmz7chekazz9jmj7uplvapg  
Tether(ERC20): 0x11753b26B4d91177B779D429a6a1C1C90f722f1C  
BTC: bc1qpd2v5acc8m8gjmpg78lhz5uakjxdclmawq3xdc  


## Roadmap:
- [x] Send patch to kernel mainline (currently only turbo mode for 315-53 is implemented)  
- [x] Implement Turbo mode  
- [x] Implement RGB Dynamic effects (4-zone)  
- [ ] GUI ([https://github.com/zehratullayl/Linux-Predator-GUI](Zehra) is working on this)
- [ ] Custom Fans speed
- [ ] Implement RGB Static coloring (4-zone)  
- [ ] Implement RGB Dynamic effects (per key RGB)  
- [ ] Implement RGB Static coloring (per key RGB)  
