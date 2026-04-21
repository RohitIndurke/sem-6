import random

print("\n*----------Welcome to Guess Number Game----------*\n")

n = random.randint(1, 100)
count = 0

while True:
    guess = int(input("Enter your guess: "))
    count += 1

    if n < guess:
        print("Lower")
    elif n > guess:
        print("Higher")
    else:
        break

print(f"\n Congratulations! You guessed it in {count} attempts")
