# решение задач на семинаре
from unittest.mock import Mock

import pytest
from Tasks import Tasks


#1
def test_average ():
    numbers = [10, 20, 30, 40, 50]
    assert Tasks.find_average(numbers) == 30

def test_average_null ():
    assert Tasks.find_average([]) == 0


#2
def test_average_not_list ():
    string_list = ["10", "20", "30", "40", "50"]
    with pytest.raises(TypeError):
        Tasks.find_average(string_list)


#3
def test_check_receive_money():
    person = Tasks.Person(200)
    bank = Tasks.Bank()

    person.transfer_money(100, bank)
    assert person.balance == 100
    assert bank.balance == 100

def test_check_receive_money_fall():
    person = Tasks.Person(200)
    bank = Tasks.Bank()
    with pytest.raises(ValueError):
        person.transfer_money(250, bank)


#4
def test_check_receive_money_mock():
    bank = Mock()
    person = Tasks.Person(200)
    person.transfer_money(100, bank)

    bank.receive_money.assert_called_with(100)


# def test_transfer_with_mock():
#     person = Tasks.Person(1000)
#     bank_mock = Mock()  # Создаём мок-объект для банка

#     person.transfer_money(500, bank_mock)
#     bank_mock.receive_money.assert_called_with(500)  
# # Проверяем, был ли вызван метод receive_money с аргументом 500



#5
def test_division_zero():
    with pytest.raises(ZeroDivisionError):
        Tasks.divide(10, 0)


#6
@pytest.mark.parametrize("a, b, expected", [
    (10, 0, 0), (2, 3, 6), (-2, 10, -20)])
def test_mult(a, b, expected):
    assert Tasks.multiply(a, b) == expected



#7
def test_len_string():
    assert len("Geek") == 4  # Строка из 6 символов
    assert len("") == 0  # Пустая строка
    assert len(" ") == 1  # Строка из одного пробельного символа
    assert len("Hello, World!") == 13  # Строка с пробелами и знаками препинания


#8
# проверка готового теста, вызвав команду в терминале -  прямо из файла Tasks.py
# python -m doctest Tasks.py  -- команда
    @staticmethod
    def square(n):
        """
        This function returns the square of a number.
        >>> Tasks.square(4)
        16
        >>> Tasks.square(0)
        0
        """
        return n ** 2



#9
@pytest.mark.parametrize("test_input, expected", [
    (2, True), (11, True), (6, False)])
def test_is_prime_positive(test_input, expected):
    assert Tasks.is_prime(test_input) == expected