function solution(number) {
    return String(number).split('').map(Number).reduce((acc, cur) => acc + cur, 0)%9;
}