function solution(a, b, c, d) {
    const nums = [a,b,c,d];
    const sortNums = nums.sort((x,y) => x - y);
    if(sortNums[0]===sortNums[3]){
        return 1111*sortNums[0];
    }
    if (sortNums[0] === sortNums[2] || sortNums[1] === sortNums[3]) {
        const p = sortNums[1];
        const q = sortNums[0] === sortNums[2] ? sortNums[3] : sortNums[0];
        return Math.pow(10 * p + q, 2);
    }
    if (sortNums[0] === sortNums[1] && sortNums[2] === sortNums[3]){
        return (sortNums[0] + sortNums[2]) * Math.abs(sortNums[0]-sortNums[2]);
    }
    if (sortNums[0] === sortNums[1]){
        return sortNums[2] * sortNums[3];
    }
    if (sortNums[1] === sortNums[2]){
        return sortNums[0] * sortNums[3];
    }
    if (sortNums[2] === sortNums[3]){
        return sortNums[0] * sortNums[1];
    }
    return sortNums[0];
}