void main() {
  List<int> array = [1, 2, 3, 4, 5, 6];
  num result = 0;
  result = sum_array(array);
  print(result);
}

num sum_array(List arr) {
  num sum = 0;
  for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
  }

  return sum;
}
