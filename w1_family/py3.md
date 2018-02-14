# A + B
####题目描述
若某个家族人员过于庞大，要判断两个是否是亲戚，确实还很不容易，现在给出某个亲戚关系图，求任意给出的两个人是否具有亲戚关系。

规定：x和y是亲戚，y和z是亲戚，那么x和z也是亲戚。如果x,y是亲戚，那么x的亲戚都是y的亲戚，y的亲戚也都是x的亲戚。

定义一个类Solution, 其包含至少两个函数:
* `setFamily(x,y)`, 调用的时候表示告诉你x和y是亲戚. 
* `isFamily(x,y)`, 如果x和y是亲戚，返回True，否则False.

####参数
```
x,y: int 0<=x,y<=5000
```

####示例
```
>>>solution.setFamily(1, 2)
>>>solution.setFamily(1, 5)
>>>solution.setFamily(3, 4)
>>>solution.setFamily(5, 2)
>>>solution.setFamily(1, 3)
>>>solution.isFamily(1, 4)
True
>>>solution.isFamily(2, 3)
True
>>>solution.isFamily(5, 6)
False
```

####提示
1. 在右边的代码编辑框编辑你的代码, 你也可以使用自己喜欢的编辑器写好代码之后复制过来.
2. 你不能使用print打印任何内容，这会影响到判题的结果。
3. 你提交的代码必须包含Solution类。