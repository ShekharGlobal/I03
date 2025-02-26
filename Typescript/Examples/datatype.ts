let userInput: unknown = prompt("Please enter something:");

// Since the input is always a string or `null`, you should handle the type:
if (typeof userInput === "string") {
    console.log("User entered:", userInput.toUpperCase()); // Example operation
} else {
    console.log("No input provided!");
}
