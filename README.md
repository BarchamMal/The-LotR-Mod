# The-LotR-Mod
 An I'm-not-sure-how-well-known fact is that Gandalf did _not_ say "You shall not pass!", he said "You cannot pass!", and he said it 3 times.

## Description
 - This mod is planned to be a fabric LotR mod.
 - This is a super-ultra-alpha LotR mod (In other words: It is very much a work in progress and not at all complete)
 - This mod is made with no intent to be compatible (1) with vanilla, and therefore I will not be adding carcases (2) for zombies, (Probably not in Middle Earth.) piglins, (_Not_ in Middle Earth!) Endermen, (Must I even say somthing here?) or whatever else will never be seen in Middle Earth.

## Contribution
 - Help would be much appreciated as this mod is coming along very slowly.
 - Currently I am adding features (Like carcases or EffectSword, EffectAxe, EffectMace) and do not have time to complete features, (Like adding carcases for rabbits, bats, salmon, or what have you)
 - As I am focusing on adding features (not so much content) and I don't want to leave holes in the project, I end up overlooking a _lot_ of things (i.e toughness and knockback resistance of armors, or like proper item grouping) and those things definitively need fixed.

## Gameplay Ideas
- Combat:
  - Armor: Armor will be a main focus in this mod, without some type of armor (even the lowest quality: copper) you will be killed by just about anything in 1-2 hits, therefore the worst armor is as good as diamond.
  - Weapons: To inforce the power of armor, weapons will be much more powerful, thereby widening the gap between damage you take with armor, and without.
  - Fighting: In many mods (Like Mevans' Forge LotR mod) it is not an amazing feet to kill 20 orcs (In Mevans' LotR mod you need to kill 50 orcs right near Loth Lorien in order to even trade with them) but here, I would like to make enemies much more powerful, almost as strong as a player, and make is quite an amazing feet to kill, say, a troll for example.
  - Animals: I've made some mixins to buff animal stats. (Make them harder to kill)

 - Looting:
   - Items: First, I'd like to say that as minecraft players can hold 64 * 37 = 2368 cubic meters of iron (And in Mevans' LotR mod storage was not hard to get, which I enjoyed) I am not worried too much about players holding a _lot_ of items.
   - Carcases: When players kill animals (or orcs, men, elves, trolls, etc when I add them) they will drop Carcases. A carcase contains all the loot of that creature, and can be taken apart by holding a sword in your mainhand, and the carcases (they can stack) in your offhand and interacting (right clicking). Technically a carcase could have a thousand stages (different items it turns into i.e. Dead Cow, Skinned Dead Cow, Cow Skeleton) but mostly they will have 2-5 stages.
  
## Code code (the code this mod's code must follow)
 - Splitting materials: I've noticed that many mods have all they're blocks registered in one file. (ModBlocks.java) I consider this a messy way of coding.
 - In this mod, code is split up into a lot of different files, there is a folder for each metal/material (i.e. Bronze, Copper, OrcSteel, Iron) then, in that folder there are three files: (X represents the material's name) (other comment: there are a few exceptions, as with Misc)
      ```yaml
      - XArmorMaterial,
      - XToolMaterial,
      - XMaterial,
      ```
    Each file has a certain purpose:
      - XArmorMaterial: If you know how adding armors work then you already know what this does. Every armor item gets it's stats from an ArmorMaterial.
      - XToolMaterial: Same as the ArmorMaterials, tools and weapons get they're stats from ToolMaterials.
      - XMaterial: In this file is registered the nuggets, ingots, ores  (3), armors, tools, weapons, ArmorMaterial, and ToolMaterial.
 

## Credits
- Why are these always at the end? Shouldn't they be at the beginning?
- Code: BarchamMal
- Art: BarchamMal
- Ideas: John Ronald Reuel Tolkien

## Explanations/Definitions
 1. By "Not Compatible" I mean that it adds copper ingots and gear, iron ingots and gear, adds gear that will be easy to make and much more powerful than even netherite, and doesn't add carcases for most vanilla mobs.
 2. I'm not British, but I spelled it that way before I noticed that it was the wrong spelling, and I didn't want to change everything.
 3. Not yet implemented.
