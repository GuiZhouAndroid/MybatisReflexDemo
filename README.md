# MybatisReflexDemo
Java反射+动态代理 与  Mybatis框架学习自建项目

***多表关联实体与标签对应关系分析***
（1）一对一：添加对方的对象（A实体有B实例对象 + B实体有A实例对象），使用<resuletMap>+<association>标签联合包裹。（根据查询业务改变标签集合内外层的映射）
（2）一对多：一方实体添加多方实体的List对象集合，使用<resuletMap>+<collection>标签联合包裹。（一方实体采用<resuletMap>标签包裹，多方实体采用<collection>标签包裹）
（3）多对一：多方实体添加一方实体的对象，使用<resuletMap>+<association>标签联合包裹。（多方实体采用<resuletMap>标签包裹，一方实体采用<association>标签包裹）
（4）多对多：多方实体添加多方实体的List对象集合，使用<resuletMap>+<collection>标签联合包裹。（多方实体采用<resuletMap>标签包裹，多方实体采用<collection>标签包裹，根据查询业务改变标签集合内外层的映射）
