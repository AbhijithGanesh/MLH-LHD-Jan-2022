let string = "Hello World";

const Reverse = (str) => {
    let newString = str.split(" ")
    let rev = newString.reverse();
    let join = rev.join("");
    return join
}