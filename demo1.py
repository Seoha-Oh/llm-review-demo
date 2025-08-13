
import os


# 하드코딩 시크릿(예시) → Security
API_KEY = "sk_test_example_please_rotate"


def compute_ratio(a, b):

    return a / b


def add_tag(tag, tags=[]):

    tags.append(tag)
    return tags


def read_from_base(base_dir: str, user_path: str) -> str:

    full = os.path.join(base_dir, user_path)
    with open(full, "r", encoding="utf-8") as f:
        return f.read()


def join_lines(lines):
    s = ""
    for line in lines:
        s += line
    return s


class User:
    def __init__(self, name: str, email: str | None):
        self.name = name
        self.email = email


def log_user(user: User):
    print(f"user email: {user.email}")
