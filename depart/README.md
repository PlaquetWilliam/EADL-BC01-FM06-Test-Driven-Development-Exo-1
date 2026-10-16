# Exercice 1 – Le carré d'un entier en Red-Green-Refactor

Durée : 30 minutes, en binômes, en ping-pong (l'un écrit le test, l'autre le fait passer, puis on échange).

## Contexte

Vous construisez une petite bibliothèque de calcul pour une calculatrice pédagogique. Ses utilisateurs sont des collégiens,
donc tout peut arriver : zéro, nombres négatifs, très grands nombres. La bibliothèque doit répondre juste ou refuser
clairement, jamais renvoyer un résultat faux en silence.

La première fonction à écrire est `carre(n)`, le carré d'un entier. Si le temps le permet, une deuxième fonction suit :
`puissance(base, exposant)`.

Le code de production se met dans `src/main/java/fr/ekod/calcul/` (par exemple une classe `Calcul`), les tests dans
`src/test/java/fr/ekod/calcul/`. Le projet est volontairement vide : tout reste à écrire, tests compris.

## Ce qu'il faut faire

1. **Écrire la liste de tests avant de coder.** Sur papier ou dans `JOURNAL.md`, sans code. Elle doit couvrir au moins
   le cas nominal, zéro, les négatifs et la limite du type.
2. **Suivre le cycle à la lettre**, un test à la fois :
   - **RED** : écrire un seul test, le lancer, constater qu'il échoue (et pour la bonne raison).
   - **GREEN** : écrire le code le plus simple qui le fait passer, même s'il est naïf.
   - **REFACTOR** : nettoyer le code et les tests, sans changer le comportement, tests toujours verts.
   - **COMMIT** : un commit à la fin de chaque étape, dont le message commence par `RED`, `GREEN` ou `REFACTOR`.
3. **Tenir le journal des cycles** dans `JOURNAL.md`, une ligne par cycle.
4. Si le temps le permet, enchaîner avec `puissance(base, exposant)` en gardant la même discipline.

### Format du journal des cycles

| N° | Test | Pourquoi maintenant | Code minimal écrit | Refactoring |
|----|------|---------------------|--------------------|-------------|
| 1 | le test écrit, en une phrase | pourquoi celui-là et pas un autre | ce que vous avez écrit pour passer au vert | ce que vous avez nettoyé, ou « rien » |

## La question piège

Posez-vous la question avant de coder, puis écrivez le test qui y répond :

> **46 341 au carré, ça tient dans un `int` ?**

Faites le calcul à la main, puis laissez votre test vous répondre. Que doit faire votre fonction dans ce cas ?

## Lancer les tests

```
mvn test
```

Prérequis : JDK 17 ou plus, Maven 3.9 ou plus.
