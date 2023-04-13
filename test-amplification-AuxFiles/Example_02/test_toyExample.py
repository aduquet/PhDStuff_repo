import pytest
from toyExample import ToyExample


class TestToyExample:

    

    def pytest_addoption(parser):
        parser.addoption("--input", action="store", help="input for ToyExample")


    @pytest.fixture(scope="module")
    def toy(self, request):
        input = request.config.getoption("--input")
        print(input)
        return ToyExample(input)

    def test_count_occurrences_after_removing_duplicates(self, toy):
        toy.remove_duplicates()
        toy.reverse_data()
        assert toy.calculate_sum() == 14
        return True
