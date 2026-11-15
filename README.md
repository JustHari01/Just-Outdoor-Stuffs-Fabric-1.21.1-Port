# Just Outdoor Stuffs (UNOFFICIAL) — Fabric 1.21.1

An unofficial Fabric port of **Just Outdoor Stuffs** for Minecraft 1.21.1, based on the upstream 1.20.1 source. This project is not affiliated with the original authors.

## What is included

- The original Garden and Patio decoration content.
- The original `justoutdoorstuffs` mod ID and registry identifiers.
- Original textures, models, recipes, and translations, copied unchanged from the upstream MIT-licensed source.
- Ported Minecraft/Fabric API calls for 1.21.1, including chair seating and multiblock furniture behavior.

Keeping the registry identifiers is intended to retain the original names. Loading worlds from another Minecraft version is not guaranteed.

## Requirements

- Minecraft 1.21.1
- Java 21 or newer
- Fabric Loader 0.16.14 or newer
- Fabric API for Minecraft 1.21.1

## Build

Run `./gradlew remapJar` (Windows: `gradlew.bat remapJar`). The remapped JAR is written to `build/libs/`.

## Verification status

- `compileJava` and `compileClientJava`: passed.
- `remapJar`: passed.
- Isolated Fabric dedicated-server smoke test: the mod loaded, a fresh world and spawn chunks initialized, and the server saved all dimensions on shutdown.
- Client rendering and in-game interaction have not yet been verified in a graphical client.

## Credits and license

The upstream project is by Hyenify. The 1.20.1+ source and porting work this project is based on are credited to ringpro and ImJustSeiyin. This port keeps the upstream MIT license and notice in `LICENSE`.

- Upstream project: [Just Outdoor Stuffs on CurseForge](https://www.curseforge.com/minecraft/mc-mods/just-outdoor-stuffs)
- Upstream source: [ringprod/Just-Outdoor-Stuffs](https://github.com/ringprod/Just-Outdoor-Stuffs)

AI disclosure: AI tools assisted with adapting the code to Minecraft 1.21.1 and preparing this port. Original textures, models, recipes, and translations are unchanged from the MIT-licensed upstream source.
