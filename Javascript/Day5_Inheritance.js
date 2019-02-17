// Objective

// In this challenge, we practice implementing inheritance and use JavaScript prototypes to add a new method to an existing prototype. Check out the attached Classes tutorial to refresh what we've learned about these topics.

// Task

// We provide the implementation for a Rectangle class in the editor. Perform the following tasks:

//     Add an area method to Rectangle's prototype.
//     Create a Square class that satisfies the following:
//         It is a subclass of Rectangle.
//         It contains a constructor and no other methods.
//         It can use the Rectangle class' area method to print the area of a Square object.

// Locked code in the editor tests the class and method implementations and prints the area values to STDOUT





class Rectangle {
    constructor(w, h) {
        this.w = w;
        this.h = h;
    }
}
    
/*
 *  Write code that adds an 'area' method to the Rectangle class' prototype
 */
Rectangle.prototype.area = function () {
    return this.w * this.h;
}

/*
 * Create a Square class that inherits from Rectangle and implement its class constructor
 */
class Square extends Rectangle{
    constructor(value) {
        // The super keyword is used to call corresponding methods of super class. This is one advantage over prototype-based inheritance.
        //the super function will set this.w and this.h to value
        super(value, value);
    }

}


if (JSON.stringify(Object.getOwnPropertyNames(Square.prototype)) === JSON.stringify([ 'constructor' ])) {
    const rec = new Rectangle(3, 4);
    const sqr = new Square(3);
    
    console.log(rec.area());
    console.log(sqr.area());
} else {
    console.log(-1);
    console.log(-1);
}