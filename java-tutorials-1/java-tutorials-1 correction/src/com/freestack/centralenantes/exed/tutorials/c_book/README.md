
## Arrays d'objets

Créer une fonction qui retourne le nom du chapitre dont le début est le plus proche d’un numéro de page donné.
Si les 2 chapitres sont équidistants, on retourne le chapitre ayant le numéro de page le plus élevé.
 
```
System.out.println(nearestChapter(new Chapter[] {
  new Chapter("Chapter 1", 1),
  new Chapter("Chapter 2", 15),
  new Chapter("Chapter 3", 37)
}, 10))
```
`> Chapter 2`

```
System.out.println(nearestChapter(new Chapter[] {
  new Chapter("New Beginnings", 1),
  new Chapter("Strange Developments", 62),
  new Chapter("The End?", 194),
  new Chapter("The True Ending", 460)
}, 200)
```
`> The End?`

```
System.out.println(nearestChapter(new Chapter[] {
  new Chapter("Chapter 1a", 1),
  new Chapter("Chapter 1b", 5)
}, 3))
```
`> Chapter 1b`