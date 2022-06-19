package com.lz.template;

/**
 * @author lz
 * @Package com.lz.template
 * @Description:
 * @date 2022/3/6 9:38
 */
// 抽象类。它被声明为抽象，用来作为基类，其子类必须实现其操作
public abstract class AbatractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();  // 增加了一个钩子方法
    }

    abstract void primitiveOperation2();

    abstract void primitiveOperation1();

    /***
     * 这个具体的方法被定义在抽象类中，将它声明为final，这样一来子类就无法覆盖它。它可以被模板方法直接使用，或者被子类使用
     */
    final void concreteOperation() {
        // 这里是实现
    }

    /***
     * 这个一个具体的方法，但它什么事情都不做
     *
     * 这种默认不做事的方法，称之为 钩子方法。 子类可以视情况决定要不要覆盖他们
     */
    void hook() {
    }

}
