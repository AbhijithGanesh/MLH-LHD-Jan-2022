fn main() {
    let string: &str = "Hello World!";
    print!("{}",string.chars().rev().collect::<String>())
}
