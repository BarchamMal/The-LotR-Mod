
dirs = [
    "cooked_food_from_campfire_cooking.json",
    "cooked_food_from_smoking.json",
    "cooked_food.json",
]

folder = __file__.split('/')
folder.pop()
folder.pop()
nullify = True
for dir in folder:

    if nullify == True:
        folder = ""
        nullify = False

    folder += dir + '/'
    

print(folder)
foodFolder = "recipes/"

foods = """
chicken_leg,
chicken_wing,
ground_beef,
ground_mutton,
ground_pork,
liver,
rib,
tongue,
sausage,
ham,
bacon
""".replace("\n", "").split(',')

for food in foods:
    for dir in dirs:

        file = open(folder + dir)
        text = file.read()

        text = text.replace('"category": "food"', '"category": "amp&"')
        text = text.replace("has_food", "has_"+food)
        text = text.replace("cooked_food", "lotr:cooked_"+food)
        text = text.replace("food", "lotr:"+food)
        text = text.replace("amp&", "food")

        name = dir.replace("food", food)

        save = open(folder + foodFolder + name, "w")
        save.write(text)