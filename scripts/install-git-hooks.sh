#!/bin/sh
set -eu

repo_root="$(git rev-parse --show-toplevel)"

git config core.hooksPath "$repo_root/.githooks"
chmod +x "$repo_root/.githooks/pre-commit"

echo "Installed repository git hooks from $repo_root/.githooks"
