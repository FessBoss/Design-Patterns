# Паттерны проектирования (Design patterns)

[Стратегия (Strategy)](https://github.com/FessBoss/Design-Patterns/tree/main/Strategy) <br/>
**Цель:** <br/>
Взаимозаменяемость семейства классов.

**Для чего используется:** <br/>
Определение семейства классов, инкапсулирование каждого из них и организация их взаимозаменяемости.

**Пример использования** <br/>
- есть несколько родственных классов, которые отличаются поведением;
- необходимо иметь несколько вариантов поведения;
- в классе есть данные, о которых должен знать клиент;
- с помощью условных операторов в классе определено большое количество возможных поведений.

[Наблюдатель](https://github.com/FessBoss/Design-Patterns/tree/main/Observer) <br/>
**Цель:** <br/>
Определение зависимости "один ко многим" между объектами.

**Для чего используется:** <br/>
Определение зависимости "один ко многим" между объектами таким образом, что при изменении состояния одного объекта 
все зависящие от него объекты были уведомлены об этом и обновились.

**Пример использования** <br/>
- когда у модели имеются два аспекта, один из которых зависит от другого. 
  Инкапсулирование этих аспектов в разные классы позволяют использовать их независимо друг от друга;
- когда один объект должен оповещать другие и не делать предположений об этих объектах;
- ослабление связи между объектами.