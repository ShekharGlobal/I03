let num1: number = 3; // A variable declared in the global scope.

function letDeclaration() {
    let num2: number = 5; // A variable declared in the function scope.

    // Block 1: If condition
    if (num2 > num1) {
        let num3: number = 3; // A variable declared in the block scope of the `if`.
        num3++;               // num3 is incremented to 4, but it remains in this block's scope.
    }

    // Block 2: While loop
    while (num1 < num2) {
        let num4: number = 4; // A variable declared in the block scope of the `while` loop.
        num1++;               // num1 is incremented until it equals num2.
    }

    console.log(num1); // OK: Prints the final value of num1.
    console.log(num2); // OK: Prints the value of num2.
    // console.log(num3); // Compiler Error: num3 is block-scoped and cannot be accessed outside the `if`.
    // console.log(num4); // Compiler Error: num4 is block-scoped and cannot be accessed outside the `while`.
}

letDeclaration();
