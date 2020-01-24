# SingtelAssignment
Classes:
Animal
-	Superclass that has static values to count animals that can walk, sing, swim and fly.
WalkingCapability
-	Contains method walk
FlyingCapability
-	Contains method fly
Swim Capability
-	Contains method swim
Singing Capability
-	Contains method sing
Land Animal
-	Inherits Animal
-	Has walkingCapability
-	On load increments walkCount
-	Abstract class. All subclasses must implement sound
Bird
-	Has flyingCapability
-	Has singingCapbility
-	On load increments flyCount and singCount
-	Default sound as tweet tweet
Duck
-	Inherits from Bird
-	Also has swimCapability
-	On load increases swimCount
-	Overrides sound as quack quack
Chicken
-	- Inherits from Bird
-	On load decreases flyCount
-	FlyingCapability as null
-	Overrides sound as cluck cluck
-	Has own fly method
Rooster
-	Inherits from Chicken
-	Overrides sound as Cock-a-doodle-doo
-	Has method to sound with parameter language
LanguageConstants
-	Contains constant values for Languages
-	Contains map with sounds based on string key
Parrot
-	Inherits bird
-	Has nearbyObject attribute
-	Overrides sound based on attribute sound
SoundingObject
-	Interface with sound method
Phone
-	Implements SoundingObject
-	Implements sound method
Dog/Cat
-	Inherits from LandAnimal
-	Overrides sound method
Dolphin
-	Inherits from Animal
-	Has swimCapability
-	On Load increments swimCount
Fish
-	Inherits from Animal
-	Has size and color attribute
-	Has swimCapability
-	On Load increments swimCount
Shark
-	Inherits from Fish
-	Has eat method
Clownfish
-	Inherits from Fish
-	Has joke method
Butterfly
-	Inherits from Animal
-	Has flying capability
-	On load increments flyCount
Catterpillar
-	Inherits from Animal
-	Has walkingCapability
-	On load increments walkCount
